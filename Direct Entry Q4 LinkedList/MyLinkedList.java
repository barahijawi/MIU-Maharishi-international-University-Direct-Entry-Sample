public class MyLinkedList{

    private ListItem root;

    public MyLinkedList(){
        this.root = null;
    }

    @Override
    public String toString(){
        String string = "";
        ListItem currentItem = this.root;
        if(root !=null)
        {
            string += root.getValue().toString();
            while(currentItem.getNext() !=null)
            {
                currentItem = currentItem.getNext();
                string += ","+ currentItem.getValue().toString();

            }
        }

        return string;
    }
    public  void add(Object newItem){
        ListItem item = new ListItem(newItem);
        if(this.root == null) {
            this.root = item;
        }else{
            ListItem currentItem = this.root;
            while(currentItem.getNext() != null)
            {
                currentItem = currentItem.getNext();
            }
            currentItem.setNext(item);
        }
    }
    public  boolean find(Object item){
        if(root.getNext() == null)
        {
            return false;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){

            if(currentItem.getValue().toString().equals(item.toString())){
                return true;
            }
            currentItem = currentItem.getNext();
        }
        return false;
    }

}
