public class GnreTest {

    public static void main(String[] args) {
        String logs;
        GnreAPI api = new GnreAPI();
        //logs = api.configurar("@cafe@","changeit","D:\\Projects\\certificados\\1.pfx","D:\\Projects\\certificados\\producao.cacerts","PR","100013");
        logs = api.transmitit(
                "PR",
                "100013",
                "07038710000150",
                "04",
                "1314834209",
                "1.00",
                "",
                "EMITENTE TESTE",
                "ENDERECO EMITENTE TESTE",
                "06200",
                "MG",
                "38540970",
                "",
                "439999999",
                "2312312",
                "",
                "10",
                "2020",
                "",
                "2.00");
        System.out.println(logs);
    }
}
