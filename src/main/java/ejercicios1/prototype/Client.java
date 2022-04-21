package ejercicios1.prototype;

public class Client {

    public static void main (String[]args){
        ContratoDocente docenteC1= new ContratoDocente();
        docenteC1.setNombre("jose");
        docenteC1.setApellido("perez");
        docenteC1.setSueldo("5000");
        docenteC1.setMarcadoSalida("18:00");
        docenteC1.setMarcadoEntrada("08:00");
        docenteC1.setMarcadoBiometrico(false);
        docenteC1.setCursoEducacionSuperior(true);
        docenteC1.setCargaHoraria("80");
        docenteC1.setAccesoPlataforma(true);

        ContratoDocente docenteC2= (ContratoDocente) docenteC1.clone();
        docenteC2.setNombre("jose2");
        docenteC2.setApellido("perez2");

        ContratoDocente docenteC3= (ContratoDocente) docenteC1.clone();
        docenteC3.setNombre("jose3");
        docenteC3.setApellido("perez3");

        ContratoDocente docenteC4= (ContratoDocente) docenteC1.clone();
        docenteC4.setNombre("jose4");
        docenteC4.setApellido("perez4");
        ContratoDocente docenteC5= (ContratoDocente) docenteC1.clone();
        docenteC5.setNombre("jose5");
        docenteC5.setApellido("perez5");
        ContratoDocente docenteC6= (ContratoDocente) docenteC1.clone();
        docenteC6.setNombre("jose6");
        docenteC6.setApellido("perez6");
        ContratoDocente docenteC7= (ContratoDocente) docenteC1.clone();
        docenteC7.setNombre("jose7");
        docenteC7.setApellido("perez7");
        ContratoDocente docenteC8= (ContratoDocente) docenteC1.clone();
        docenteC8.setNombre("jose8");
        docenteC8.setApellido("perez8");
        ContratoDocente docenteC9= (ContratoDocente) docenteC1.clone();
        docenteC9.setNombre("jose9");
        docenteC9.setApellido("perez9");
        ContratoDocente docenteC10= (ContratoDocente) docenteC1.clone();
        docenteC10.setNombre("jose10");
        docenteC10.setApellido("perez10");
        ContratoDocente docenteC11= (ContratoDocente) docenteC1.clone();
        docenteC11.setNombre("jose11");
        docenteC11.setApellido("perez11");
        ContratoDocente docenteC12= (ContratoDocente) docenteC1.clone();
        docenteC12.setNombre("jose12");
        docenteC12.setApellido("perez12");
        ContratoDocente docenteC13= (ContratoDocente) docenteC1.clone();
        docenteC13.setNombre("jose13");
        docenteC13.setApellido("perez13");
        ContratoDocente docenteC14= (ContratoDocente) docenteC1.clone();
        docenteC14.setNombre("jose14");
        docenteC14.setApellido("perez14");
        ContratoDocente docenteC15= (ContratoDocente) docenteC1.clone();
        docenteC15.setNombre("jose15");
        docenteC15.setApellido("perez15");

        docenteC1.showData();
        docenteC2.showData();
        docenteC3.showData();
        docenteC4.showData();
        docenteC5.showData();
        docenteC6.showData();
        docenteC7.showData();
        docenteC8.showData();
        docenteC9.showData();
        docenteC10.showData();
        docenteC11.showData();
        docenteC12.showData();
        docenteC13.showData();
        docenteC14.showData();
        docenteC15.showData();
    }
}
