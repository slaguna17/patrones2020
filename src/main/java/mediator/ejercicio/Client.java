package mediator.ejercicio;

public class Client {


    public static void main (String [] arg) {
        Skype skypeUpbTeam = new Skype();

        Qa qa1 = new Qa(skypeUpbTeam);
        qa1.setName("jose");
        Qa qa2 = new Qa(skypeUpbTeam);
        qa2.setName("juan");
        Qa qa3 = new Qa(skypeUpbTeam);
        qa3.setName("maria");

        Dev dev1 = new Dev(skypeUpbTeam);
        dev1.setName("dev1");
        Dev dev2 = new Dev(skypeUpbTeam);
        dev2.setName("dev2");
        Dev dev3 = new Dev(skypeUpbTeam);
        dev3.setName("dev3");
        Dev dev4 = new Dev(skypeUpbTeam);
        dev4.setName("dev4");
        Dev dev5 = new Dev(skypeUpbTeam);
        dev5.setName("dev5");

        ScrumMaster sm1= new ScrumMaster(skypeUpbTeam);
        sm1.setName("upb sm1");

        skypeUpbTeam.addColleague(qa1);
        skypeUpbTeam.addColleague(qa2);
        skypeUpbTeam.addColleague(qa3);

        skypeUpbTeam.addColleague(dev1);
        skypeUpbTeam.addColleague(dev2);
        skypeUpbTeam.addColleague(dev3);
        skypeUpbTeam.addColleague(dev4);
        skypeUpbTeam.addColleague(dev5);

        skypeUpbTeam.addColleague(sm1);


        qa1.send("hello QA Team");
        qa3.send("Hi All");


        dev1.send("hello DEV Team");
        dev4.send("hello world");

        sm1.send("Hello ALL !!! Dev and QA, Sprint Start Today");

    }

}
