public class TCPConnection {

    private TCPConnectionState state;

    public TCPConnection() {
        this.state = new ClosedState();
    }

    public void setState(TCPConnectionState state) {
        if (state == null) {
            throw new IllegalArgumentException("The connection state cannot be null.");
        }

        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }
}

