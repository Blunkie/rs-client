package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(BufferedFile::class)
class ArchiveDisk : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<BufferedFile>() } == 2 }

    @DependsOn(BufferedFile::class)
    class datFile : OrderMapper.InConstructor.Field(ArchiveDisk::class, -2, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<BufferedFile>() }
    }

    @DependsOn(BufferedFile::class)
    class idxFile : OrderMapper.InConstructor.Field(ArchiveDisk::class, -1, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<BufferedFile>() }
    }

    class archive : OrderMapper.InConstructor.Field(ArchiveDisk::class, -2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    //TODO fix
//    class maxEntrySize : OrderMapper.InConstructor.Field(ArchiveDisk::class, -1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }

    @MethodParameters("entry")
    class read : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == ByteArray::class.type }
    }

    @MethodParameters()
    @DependsOn(BufferedFile.write::class)
    class write0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == method<BufferedFile.write>().id } }
    }

    @MethodParameters()
    @DependsOn(write0::class)
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == method<write0>().id } }
    }
}