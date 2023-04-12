package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class Node extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 3 &&
                classNode.getCountFieldsOfType(Type.LONG_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.getObjectType(classNode.getName())) == 2 &&
                classNode.isOwnerless();
    }
}
