public class OpenState implements TCPConnectionState {

    @Override
    public void open(TCPConnection connection) {
        System.out.println("The connection is already open.");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing connection...");
        connection.setState(new ClosedState());
    }
}
