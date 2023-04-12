package identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.TypeInsnNode;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

import java.util.Arrays;

@DependsOn({UserList.class,ClanMate.class})
public class ClanChat extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("UserList") &&
                classNode.getInstanceMethods().stream().flatMap(methodNode -> Arrays.stream(methodNode.instructions.toArray())).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.NEW && Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc).equals(TypeUtilities.getTypeOfIdentifiedClass("ClanMate")));
    }
}
