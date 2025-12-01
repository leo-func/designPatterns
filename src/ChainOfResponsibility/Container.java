package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

abstract class Container extends Component {
    protected List<Component> children = new ArrayList<Component>();

    public void add(Component child) {
        children.add(child);
        child.container = this;
    }
}
