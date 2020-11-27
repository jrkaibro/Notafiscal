package app.notafiscal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.utils.DFCadeiaCertificados;

public class GerarCadeia {

    public static void main(String[] args) {
        try {
            FileUtils.writeByteArrayToFile(new File("D:\\Certificado\\homologacao.cacerts"), DFCadeiaCertificados.geraCadeiaCertificados(DFAmbiente.HOMOLOGACAO, "changeit"));
            FileUtils.writeByteArrayToFile(new File("D:\\Certificado\\producao.cacerts"), DFCadeiaCertificados.geraCadeiaCertificados(DFAmbiente.PRODUCAO, "changeit"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
