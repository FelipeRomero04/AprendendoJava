package Aulas;

public class SwitchAulas {
    public static void main(String[] args){
        //Metodo convecional

        byte dia = 2;
        String diaExtenso;
        switch (dia){
            case 1:
                diaExtenso = "Domingo";
                break;
            case 2:
                diaExtenso = "Sábado";
                break;
            case 3:
                diaExtenso = "Seg";
                break;
            case 4:
                diaExtenso = "Ter";
                break;
            case 5:
                diaExtenso = "Qua";
                break;
            case 6:
                diaExtenso = "Qui";
                break;
            case 7:
                diaExtenso = "Sex";
                break;
            default:
                diaExtenso = "Valor atribuido inválido";
                break;
        }

        System.out.println(diaExtenso);

        // Metodo switch moderno
        char sexo = 'M';
        String sexoExtenso = switch (sexo){
            case 'M' -> "Masculino";
            case 'F' -> "Feminino";
            default -> "Outro";
        };
        System.out.println(sexoExtenso);
    }
}
