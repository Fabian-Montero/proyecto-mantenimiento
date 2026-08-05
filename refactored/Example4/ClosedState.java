public class ClosedState implements TCPConnectionState {

    @Override
    public void open(TCPConnection connection) {
        System.out.println("Opening connection...");
        connection.setState(new OpenState());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("The connection is already closed.");
    }
}
