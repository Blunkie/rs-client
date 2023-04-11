package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class AbstractWorldMapIcon extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Coord")) == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2;
    }
}