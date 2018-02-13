package corejava.masterclass.sec9_array_list.array_list;

import java.util.ArrayList;

public class SimpleList {
    private ArrayList<String> arrayList = new ArrayList<>();

    public void addItemToList(String item){
        this.arrayList.add(item);
    }

    public void printListContent(){
        System.out.println("Elements count : " + this.arrayList.size());
        for (int i=0; i<this.arrayList.size(); i++){
            System.out.format("At : %d, item : %s \n", i+1, this.arrayList.get(i));
        }
    }

    public void modifyList(int index, String item){
        this.arrayList.set(index, item);
        System.out.format("Item at : %d is modified", index+1);
    }

    public void removeItemFromList(int index){
        this.arrayList.remove(index);
        System.out.format("Item at : %d is removed", index+1);
    }

    public String findItem(String searchItem){
        int index = this.arrayList.indexOf(searchItem);
        if(index>=0){
            //this.arrayList.contains(searchItem);
            System.out.format("Item : %s is found at position : %d", searchItem, index+1);
            return this.arrayList.get(index);
        }
        return null;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}
