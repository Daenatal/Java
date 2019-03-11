public class ImportDemoTest {
    public static void main(String[] args) {
        ImportDemo iD = new ImportDemo();
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);
    }
}

//don't need to explicity state to import the ImportDemo class, same directory
//we only need to compile this .java file, since this class uses ImportDemo it also compiles the .class file