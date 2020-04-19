package addson.weslley.pratica3;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.event.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML private ImageView arrowUser;
    @FXML private ImageView arrowRegister;
    @FXML private ImageView arrowMoney;

    @FXML private AnchorPane userPanel;
    @FXML private AnchorPane registerPanel;
    @FXML private AnchorPane moneyPanel;

    @FXML private ComboBox<String> comboBoxRegister;
    @FXML private ComboBox<String> comboBoxMoney;

    @FXML private JFXTextField titularTextAccount;
    @FXML private JFXTextField numeroTextAccount;

    @FXML private JFXTextField titularTextRegister;
    @FXML private JFXTextField CPFTextRegister;

    @FXML private JFXTextField numeroTextTransacao;
    @FXML private JFXTextField CPFTextTransacao;
    @FXML private JFXTextField valorTextTransacao;


    ObservableList<String> comboRegisterContent =
            FXCollections.observableArrayList(
                "Corrente","Poupança"
            );

    ObservableList<String> comboMoneyContent =
            FXCollections.observableArrayList(
                    "Sacar","Depositar"
            );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        titularTextAccount.addEventFilter(KeyEvent.ANY, handlerLetters);
        numeroTextAccount.addEventFilter(KeyEvent.ANY, handlerNumero);

        titularTextRegister.addEventFilter(KeyEvent.ANY, handlerLetters);
        CPFTextRegister.addEventFilter(KeyEvent.ANY, handlerCPF);

        numeroTextTransacao.addEventFilter(KeyEvent.ANY, handlerNumero);
        CPFTextTransacao.addEventFilter(KeyEvent.ANY, handlerCPF);
        valorTextTransacao.addEventFilter(KeyEvent.ANY, handlerNumero);


        comboBoxMoney.setItems(comboMoneyContent);
        comboBoxRegister.setItems(comboRegisterContent);
    }

    public void exitButtonClicker(MouseEvent mouseEvent) {
        Platform.exit();
        System.exit(0);
    }

    public void userButtonClicker(MouseEvent event){
        if (userPanel.isVisible()){
            userPanel.setVisible(false);
            arrowUser.setVisible(false);
            return;
        }

        userPanel.setVisible(true);
        arrowUser.setVisible(true);

        registerPanel.setVisible(false);
        arrowRegister.setVisible(false);

        moneyPanel.setVisible(false);
        arrowMoney.setVisible(false);
    }

    public void registerButtonClicker(MouseEvent event){
        if (registerPanel.isVisible()){
            registerPanel.setVisible(false);
            arrowRegister.setVisible(false);
            return;
        }

        registerPanel.setVisible(true);
        arrowRegister.setVisible(true);

        userPanel.setVisible(false);
        arrowUser.setVisible(false);

        moneyPanel.setVisible(false);
        arrowMoney.setVisible(false);

    }

    public void moneyButtonClicker(MouseEvent event){
        if (moneyPanel.isVisible()){
            moneyPanel.setVisible(false);
            arrowMoney.setVisible(false);
            return;
        }

        moneyPanel.setVisible(true);
        arrowMoney.setVisible(true);

        userPanel.setVisible(false);
        arrowUser.setVisible(false);

        registerPanel.setVisible(false);
        arrowRegister.setVisible(false);

    }

    EventHandler<KeyEvent> handlerLetters = new EventHandler<KeyEvent>() {
        private boolean willConsume = false;
        @Override
        public void handle(KeyEvent event) {
            Object temp0 = event.getSource();
            if (willConsume){
                event.consume();
            }
            String temp = event.getCode().toString();

            if (!event.getCode().toString().matches("[a-zA-Z]") && event.getCode() != (KeyCode.BACK_SPACE) && event.getCode() != (KeyCode.SHIFT) && event.getCode() != (KeyCode.SPACE)) {
                if (event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }
                else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }
        }
    };


    EventHandler<KeyEvent> handlerCPF = new EventHandler<KeyEvent>() {
        private boolean willConsume = false;
        private int maxLeght = 11;

        @Override
        public void handle(KeyEvent event) {
            JFXTextField temp = (JFXTextField) event.getSource();

            if (willConsume){
                event.consume();
            }
            if (temp.getText().length() > maxLeght - 1){
                if (event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }
                else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }
            if (event.getCode() == KeyCode.BACK_SPACE){
                if (event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }
                else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }
            if (!event.getText().matches("[0-9]") && event.getCode() != KeyCode.BACK_SPACE) {
                if (event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }
                else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }

        }
    };
    EventHandler<KeyEvent> handlerNumero = new EventHandler<KeyEvent>() {
        private boolean willConsume = false;
        private int maxLeght = 10;

        @Override
        public void handle(KeyEvent event) {
            JFXTextField temp = (JFXTextField) event.getSource();
            if (willConsume){
                event.consume();
            }
            System.out.println(temp.getText());
            if (temp.getText().length() > maxLeght - 1){
                if (event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }
                else if (event.getEventType() == KeyEvent.KEY_RELEASED){ ;
                    willConsume = false;
                }
            }
            if (event.getCode() == KeyCode.BACK_SPACE){
                if (event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }
                else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }
            if (!event.getText().matches("[0-9]") && event.getCode() != KeyCode.BACK_SPACE) {
                if (event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }
                else if (event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }

        }
    };
}
