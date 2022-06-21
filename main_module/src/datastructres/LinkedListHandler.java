package datastructres;
import java.util.LinkedList;

public class LinkedListHandler {
    private LinkedList<String> stringLinkedList;

    public LinkedListHandler() {
        this.stringLinkedList = new LinkedList<>();
    }

    public void addStringItem(String item){
        this.stringLinkedList.add(item);
    }

    public void addStringItemByIndex(int index, String item){
        this.stringLinkedList.add(index, item);
    }

    public String getStringItem(int index){
        return this.stringLinkedList.get(index);
    }
}
