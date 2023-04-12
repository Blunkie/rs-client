package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(DualNode.class)
public class SpotType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(TypeUtilities.SHORT_ARRAY) == 4 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) >= 8 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.INT_TYPE) || Type.getType(fieldNode.desc).equals(TypeUtilities.SHORT_ARRAY));
    }
}
