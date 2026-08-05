public class Main {

    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.open();
        connection.open();
        connection.close();
        connection.close();
    }
}

