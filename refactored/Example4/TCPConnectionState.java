public interface TCPConnectionState {

    void open(TCPConnection connection);

    void close(TCPConnection connection);
}
