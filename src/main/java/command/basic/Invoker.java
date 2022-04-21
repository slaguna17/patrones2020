package command.basic;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<ICommand> commandList = new ArrayList<>();

    public void setCommand(ICommand command){
        this.commandList.add(command);
    }

    public void runCommand(){
        for (ICommand command:this.commandList
             ) {
            command.execute();
        }
        commandList.clear();
    }
}
