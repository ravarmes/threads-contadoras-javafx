package thread.javafx;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.control.Label;

public class MinhaRunnable implements Runnable {

    Label label;
    int i;

    public MinhaRunnable(Label j) {
        label = j;
    }

    @Override
    public void run() {
        for (i = 1; i <= 5; i++) {
            Platform.runLater(() -> label.setText("Processando..." + i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Platform.runLater(() -> label.setText("Finalizada!"));
    }

}
