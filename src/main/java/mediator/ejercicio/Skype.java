package mediator.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Skype implements Mediator {

    private List<Qa> QaList = new ArrayList<>();
    private List<Dev> DevList= new ArrayList<>();
    private List<ScrumMaster> ScrumMasterList= new ArrayList<>();

    @Override
    public void send(String msg, Colleague colleague) {
        switch (colleague.role.toUpperCase()){
            case "QA":
                System.out.println(" <Chat Msg> ");
                for (int i = 0; i < QaList.size(); i++) {
                    if (QaList.get(i).getName() != colleague.getName())
                        QaList.get(i).messageReceived(msg);
                }
                break;
            case "DEV":
                System.out.println(" <Chat Msg> ");
                for (int i = 0; i < DevList.size(); i++) {
                    if (DevList.get(i).getName() != colleague.getName())
                        DevList.get(i).messageReceived(msg);
                }
                break;
            case "SM":
                System.out.println(" <Chat Msg> ");
                QaList.forEach((specificQA) -> specificQA.messageReceived(msg));
                DevList.forEach((specificQA) -> specificQA.messageReceived(msg));
                break;
        }
    }


    public void addColleague(Colleague colleague) {
        switch (colleague.role.toUpperCase()){
            case "QA":
                QaList.add((Qa) colleague);
                break;
            case "DEV":
                DevList.add((Dev) colleague);
                break;
            case "SM":
                ScrumMasterList.add((ScrumMaster) colleague);
                break;
        }
    }
}
