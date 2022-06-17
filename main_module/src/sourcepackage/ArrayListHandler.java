package sourcepackage;
import java.util.ArrayList;

public class ArrayListHandler {
    private ArrayList<String> stringArrayList;

    public ArrayListHandler() {
        this.stringArrayList = new ArrayList<>();
    }

    public void addStringItem(String item){
        this.stringArrayList.add(item);
    }

    public void addStringItemByIndex(int index, String item){
        this.stringArrayList.add(index, item);
    }

    public String getStringItem(int index){
        return this.stringArrayList.get(index);
    }
}
