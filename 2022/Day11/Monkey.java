import java.util.ArrayList;

public class Monkey {
    private String name;
    private ArrayList<Integer> items;
    private String operation;
    private String test;
    private String ifTrue;
    private String ifFalse;
    private int itemsSeen; //Need to add the code for this. THis is the answer stuff

    public Monkey(String name, ArrayList<Integer> items, String operation, String test, String ifTrue, String ifFalse) {
        this.name = name;
        this.items = items;
        this.operation = operation;
        this.test = test;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }
    public Monkey(){

    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Integer> items) {
        this.items = items;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Monkey getIfTrue() {
        return this.ifTrue;
    }

    public void setIfTrue(Monkey ifTrue) {
        this.ifTrue = ifTrue;
    }

    public Monkey getIfFalse() {
        return this.ifFalse;
    }

    public void setIfFalse(Monkey ifFalse) {
        this.ifFalse = ifFalse;
    }
}
