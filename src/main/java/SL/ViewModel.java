package SL;

import java.util.List;

/**
 * Created by anton on 3/14/17.
 */
public class ViewModel {

    private List<String> attributes;
    private String view;

    public ViewModel(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }
}
