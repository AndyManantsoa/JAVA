public class Library {
    // instance variables(variable which belongs to class)
    String type;
    String location;
    String name;
    int numberOfRoom;
    int libraryID;

    public Library(String type, String location, String name, int numberOfRoom, int libraryID) {
        this.type = type;
        this.location = location;
        this.name = name;
        this.numberOfRoom = numberOfRoom;
        this.libraryID = libraryID;
    }

    public void display(){
        System.out.println("Library Name: "+this.name );
        System.out.println("Library location: "+this.location );
        System.out.println("Library type: "+this.type );
        System.out.println("Library number of room: "+this.numberOfRoom );
        System.out.println("Library ID: "+this.libraryID );
    }

    public static void main(String[] args) {
        Library library = new Library("Digital", "New York", "New York Public Library", 10,1234);
        library.display();
    }
}