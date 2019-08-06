package clarity.dispatcher;

import lombok.Data;
import okhttp3.WebSocket;

@Data
public class Output {

    private String text;
    private WebSocket webSocket;
}
