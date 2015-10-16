package se.beamonpeople.anslagstavla;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Stoffe on 2015-10-16.
 */
public class InputController {
    private EditText editUserInput;
    private TextView textUserLog;
    private Button buttonUserSend;
    InputController(EditText userInput, TextView userLog, Button userSend){
        editUserInput = userInput;
        textUserLog = userLog;
        buttonUserSend = userSend;
        setupInput(userInput);
        setupLog(userLog);
        setupSend(userSend);
    }

    private void setupLog(TextView userLog) {
        userLog.setText("Chat Empty");
    }

    private void setupSend(Button userSend) {
        userSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editUserInput.setTextColor(Color.GREEN);
                textUserLog.setText(editUserInput.getText() + "\r\n");
            }
        });
    }

    private void setupInput(final EditText userInput) {
        userInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput.setText("");
                userInput.setTextColor(Color.CYAN);
            }
        });
    }


}
