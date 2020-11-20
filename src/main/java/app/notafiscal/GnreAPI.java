package app.notafiscal;

import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.gnre200.webservice.configuf.ConfigUFApplication;
import com.fincatto.documentofiscal.gnre200.webservice.loterecepcao.LoteRecepcaoApplication;
import com.fincatto.documentofiscal.gnre200.webservice.loterecepcao.LoteRecepcaoModel;

public class GnreAPI {

    String logs = "";

    public String configurar(String CertificadoSenha, String CadeiaCertificadoSenha, String CaminhoCertificado, String CaminhoCadeiaCertificado, String Estado, String Receita) {
        GnreConfiguracao.configGnre(CaminhoCertificado, CertificadoSenha, CaminhoCadeiaCertificado, CadeiaCertificadoSenha);
        ConfigUFApplication cUf = new ConfigUFApplication();
        logs = cUf.configUf(Estado, Receita, "2.00");
        return logs;
    }

    private DFUnidadeFederativa BuscaUnidadeFederativa(String UF) {
        DFUnidadeFederativa unidadefederativa;
        switch (UF) {
            case "RR":
                unidadefederativa = DFUnidadeFederativa.RR;
                break;
            case "AM":
                unidadefederativa = DFUnidadeFederativa.AM;
                break;
            case "AC":
                unidadefederativa = DFUnidadeFederativa.AC;
                break;
            case "RO":
                unidadefederativa = DFUnidadeFederativa.RO;
                break;
            case "AP":
                unidadefederativa = DFUnidadeFederativa.AP;
                break;
            case "PA":
                unidadefederativa = DFUnidadeFederativa.PA;
                break;
            case "MT":
                unidadefederativa = DFUnidadeFederativa.MT;
                break;
            case "TO":
                unidadefederativa = DFUnidadeFederativa.TO;
                break;
            case "MA":
                unidadefederativa = DFUnidadeFederativa.MA;
                break;
            case "PI":
                unidadefederativa = DFUnidadeFederativa.PI;
                break;
            case "MS":
                unidadefederativa = DFUnidadeFederativa.MS;
                break;
            case "GO":
                unidadefederativa = DFUnidadeFederativa.GO;
                break;
            case "DF":
                unidadefederativa = DFUnidadeFederativa.DF;
                break;
            case "MG":
                unidadefederativa = DFUnidadeFederativa.MG;
                break;
            case "RJ":
                unidadefederativa = DFUnidadeFederativa.RJ;
                break;
            case "SP":
                unidadefederativa = DFUnidadeFederativa.SP;
                break;
            case "SC":
                unidadefederativa = DFUnidadeFederativa.SC;
                break;
            case "RS":
                unidadefederativa = DFUnidadeFederativa.RS;
                break;
            case "ES":
                unidadefederativa = DFUnidadeFederativa.ES;
                break;
            case "BA":
                unidadefederativa = DFUnidadeFederativa.BA;
                break;
            case "RN":
                unidadefederativa = DFUnidadeFederativa.RN;
                break;
            case "CE":
                unidadefederativa = DFUnidadeFederativa.CE;
                break;
            case "AL":
                unidadefederativa = DFUnidadeFederativa.AL;
                break;
            case "PE":
                unidadefederativa = DFUnidadeFederativa.PE;
                break;
            case "PB":
                unidadefederativa = DFUnidadeFederativa.PB;
                break;
            case "SE":
                unidadefederativa = DFUnidadeFederativa.SE;
                break;
            case "PR":
            default:
                unidadefederativa = DFUnidadeFederativa.PR;
                break;
        }
        return unidadefederativa;
    }

    public String transmitit(String setUfFavorecida, String setCodigoReceita, String setEmitenteCnpj, String setTipoDocumentoOrigem, String setDocumentoOrigem, String setValorPrincipal, String setDataVencimento, String setEmitenteRazaoSocial, String setEmitenteEndereco, String setEmitenteCodigoMunicipio, String setEmitenteUf, String setEmitenteCep, String setDataPagamento, String setEmitenteTelefone, String setConvenio, String setPeriodo, String setMes, String setAno, String setTipoValor, String versao) {
        if ((versao == null) || (versao.isEmpty())) {
            versao = "2.00";
        }
        LoteRecepcaoModel model = new LoteRecepcaoModel();
        model.setUfFavorecida(setUfFavorecida);
        model.setCodigoReceita(setCodigoReceita);
        model.setEmitenteCnpj(setEmitenteCnpj);
        model.setTipoDocumentoOrigem(setTipoDocumentoOrigem);
        model.setDocumentoOrigem(setDocumentoOrigem);
        model.setValorPrincipal(setValorPrincipal);
        model.setEmitenteRazaoSocial(setEmitenteRazaoSocial);
        model.setEmitenteEndereco(setEmitenteEndereco);
        model.setEmitenteCodigoMunicipio(setEmitenteCodigoMunicipio);
        model.setEmitenteUf(setEmitenteUf);
        model.setEmitenteCep(setEmitenteCep);
        model.setEmitenteTelefone(setEmitenteTelefone);
        model.setDataPagamento(setDataPagamento);
        model.setDataVencimento(setDataVencimento);
        model.setEmitenteTelefone(setEmitenteTelefone);
        model.setConvenio(setConvenio);
        model.setPeriodo(setPeriodo.isEmpty() ? "0" : setPeriodo);
        model.setTipoValor(setTipoValor.isEmpty() ? "11" : setTipoValor);
        model.setMes(setMes);
        model.setAno(setAno);
        try {
            logs = LoteRecepcaoApplication.transmitir(model, versao);
        } catch (Exception e) {
            logs = e.getMessage();
            e.getStackTrace();
        }

        return logs;
    }

    public String consulta(String numeroRecibo) {
        return logs;
    }

}
