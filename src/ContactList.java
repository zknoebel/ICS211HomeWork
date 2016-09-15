
public class ContactList extends MyArrayList<Contact>{

   ContactComparator comp = new ContactComparator();
  ContactList(){
     super();
     
  }
  
  
  @Override
  public boolean add(Contact c) {

    super.add(c);
    
    insertionSort(comp);
    return true;
  }
}
