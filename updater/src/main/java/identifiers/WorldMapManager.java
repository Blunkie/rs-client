package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(IndexedSprite.class)
public class WorldMapManager extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return !classNode.getConstructors().isEmpty() &&
                TypeUtilities.getArguments(classNode.getConstructors().get(0)).stream()
                        .anyMatch(type ->
                                type.equals(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("IndexedSprite"), 1))) &&
                TypeUtilities.getArguments(classNode.getConstructors().get(0)).stream()
                        .anyMatch(type ->
                                type.equals(Type.getObjectType("java/util/HashMap")));
    }
}
