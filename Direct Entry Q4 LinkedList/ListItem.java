public  class ListItem {
    private ListItem previous;
    private ListItem next;
    private Object value;

    public ListItem(Object value){
        this.previous = null;
        this.next = null;
        this.value = value;
    }



    public ListItem getPrevious() {
        return previous;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
       this.value = value;
    }
}
