package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(Node::class, LocType::class)
class LocSound : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<LocType>() } }

    @DependsOn(LocType::class)
    class obj : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<LocType>() }
    }

    @MethodParameters()
    class set : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { true }
    }

    @DependsOn(set::class)
    class soundEffectId : OrderMapper.InMethod.Field(set::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }

    class soundEffectIds : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == IntArray::class.type }
    }

    @DependsOn(set::class, RawPcmStream::class)
    class stream1 : UniqueMapper.InMethod.Field(set::class) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == type<RawPcmStream>() }
    }

    @DependsOn(stream1::class, RawPcmStream::class)
    class stream2 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<RawPcmStream>() && it != field<stream1>() }
    }
}