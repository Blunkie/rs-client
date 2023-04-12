package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(Username.class)
public class User extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Username")) == 2 &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Comparable"));
    }
}
