public class Test {
    public static void main(String[] args) {
        GridCanvas testGrid = new GridCanvas(5, 10, 20);
        testGrid.turnOn(2, 1);
        testGrid.turnOn(2, 2);
        testGrid.turnOn(2, 3);
        testGrid.turnOn(1, 7);
        testGrid.turnOn(2, 7);
        testGrid.turnOn(3, 7);

        System.out.println("Cell Count - Turned On:" + testGrid.countOn());     
        // Add more test cases as needed
    }
}