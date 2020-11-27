import app.notafiscal.CTeAPI;
import com.fincatto.documentofiscal.cte300.classes.evento.cancelamento.CTeDetalhamentoEventoCancelamento;

public class CTeTest {


    public static void main(String[] args) {

        CTeAPI api = new CTeAPI();

        api.configurar("@cafe@",
                "changeit",
                "D:\\Projects\\certificados\\1.pfx",
                "D:\\Projects\\certificados\\homologacao.cacerts",
                "PR",
                "2");

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<CTe xmlns=\"http://www.portalfiscal.inf.br/cte\">\n" +
                "<infCte Id=\"CTe41201118374429000104570010000022121110022123\" versao=\"3.00\">\n" +
                "<ide>\n" +
                "<cUF>41</cUF>\n" +
                "<cCT>11002212</cCT>\n" +
                "<CFOP>5352</CFOP>\n" +
                "<natOp>PRESTACAO SERV TRANSPORTES A ESTAB INDUSTRIAL</natOp>\n" +
                "<mod>57</mod>\n" +
                "<serie>1</serie>\n" +
                "<nCT>2212</nCT>\n" +
                "<dhEmi>2020-11-25T13:38:41-03:00</dhEmi>\n" +
                "<tpImp>1</tpImp>\n" +
                "<tpEmis>1</tpEmis>\n" +
                "<cDV>3</cDV>\n" +
                "<tpAmb>2</tpAmb>\n" +
                "<tpCTe>0</tpCTe>\n" +
                "<procEmi>0</procEmi>\n" +
                "<verProc>1</verProc>\n" +
                "<cMunEnv>4101507</cMunEnv>\n" +
                "<xMunEnv>ARAPONGAS</xMunEnv>\n" +
                "<UFEnv>PR</UFEnv>\n" +
                "<modal>01</modal>\n" +
                "<tpServ>0</tpServ>\n" +
                "<cMunIni>4101507</cMunIni>\n" +
                "<xMunIni>ARAPONGAS</xMunIni>\n" +
                "<UFIni>PR</UFIni>\n" +
                "<cMunFim>4115200</cMunFim>\n" +
                "<xMunFim>MARINGA</xMunFim>\n" +
                "<UFFim>PR</UFFim>\n" +
                "<retira>0</retira>\n" +
                "<indIEToma>1</indIEToma>\n" +
                "<toma3>\n" +
                "<toma>0</toma>\n" +
                "</toma3>\n" +
                "</ide>\n" +
                "<compl>\n" +
                "<fluxo>\n" +
                "<xOrig>2</xOrig>\n" +
                "</fluxo>\n" +
                "<Entrega>\n" +
                "<semData>\n" +
                "<tpPer>0</tpPer>\n" +
                "</semData>\n" +
                "<semHora>\n" +
                "<tpHor>0</tpHor>\n" +
                "</semHora>\n" +
                "</Entrega>\n" +
                "<origCalc>MANDAGUARI</origCalc>\n" +
                "<destCalc>MARINGA</destCalc>\n" +
                "<xObs>000015742,</xObs>\n" +
                "</compl>\n" +
                "<emit>\n" +
                "<CNPJ>18374429000104</CNPJ>\n" +
                "<IE>9072252591</IE>\n" +
                "<xNome>J.M. TRANSPORTES LTDA ME</xNome>\n" +
                "<xFant>JM TRANSPORTES</xFant>\n" +
                "<enderEmit>\n" +
                "<xLgr>RUA SANA CASTANHA</xLgr>\n" +
                "<nro>241</nro>\n" +
                "<xBairro>JD SANTA ALICE</xBairro>\n" +
                "<cMun>4101507</cMun>\n" +
                "<xMun>ARAPONGAS</xMun>\n" +
                "<CEP>86701836</CEP>\n" +
                "<UF>PR</UF>\n" +
                "<fone>4332753810</fone>\n" +
                "</enderEmit>\n" +
                "</emit>\n" +
                "<rem>\n" +
                "<CNPJ>07038710000150</CNPJ>\n" +
                "<IE>9032296324</IE>\n" +
                "<xNome>F LOPES CAFEEIRA LTDA - EPP</xNome>\n" +
                "<xFant>CAFEEIRA BOA ESPERANCA</xFant>\n" +
                "<fone>32331561</fone>\n" +
                "<enderReme>\n" +
                "<xLgr>ROD PR 444</xLgr>\n" +
                "<nro>SN</nro>\n" +
                "<xBairro>GL PATR MANDAGUARI</xBairro>\n" +
                "<cMun>4114203</cMun>\n" +
                "<xMun>MANDAGUARI</xMun>\n" +
                "<CEP>86975000</CEP>\n" +
                "<UF>PR</UF>\n" +
                "<cPais>1058</cPais>\n" +
                "<xPais>BRASIL</xPais>\n" +
                "</enderReme>\n" +
                "<email>martinsbsi@gmail.com</email>\n" +
                "</rem>\n" +
                "<dest>\n" +
                "<CNPJ>29971780000107</CNPJ>\n" +
                "<IE>9078052128</IE>\n" +
                "<xNome>NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALO</xNome>\n" +
                "<fone>4399999999</fone>\n" +
                "<enderDest>\n" +
                "<xLgr>PRACA DAS AMERICAS</xLgr>\n" +
                "<nro>202</nro>\n" +
                "<xBairro>CENTRO</xBairro>\n" +
                "<cMun>4115200</cMun>\n" +
                "<xMun>MARINGA</xMun>\n" +
                "<CEP>87050550</CEP>\n" +
                "<UF>PR</UF>\n" +
                "<cPais>1058</cPais>\n" +
                "<xPais>BRASIL</xPais>\n" +
                "</enderDest>\n" +
                "</dest>\n" +
                "<vPrest>\n" +
                "<vTPrest>75.00</vTPrest>\n" +
                "<vRec>75.00</vRec>\n" +
                "<Comp>\n" +
                "<xNome>FRETE</xNome>\n" +
                "<vComp>75.00</vComp>\n" +
                "</Comp>\n" +
                "</vPrest>\n" +
                "<imp>\n" +
                "<ICMS>\n" +
                "<ICMSSN>\n" +
                "<CST>90</CST>\n" +
                "<indSN>1</indSN>\n" +
                "</ICMSSN>\n" +
                "</ICMS>\n" +
                "<vTotTrib>0.00</vTotTrib>\n" +
                "</imp>\n" +
                "<infCTeNorm>\n" +
                "<infCarga>\n" +
                "<vCarga>6.50</vCarga>\n" +
                "<proPred>VOLUMES</proPred>\n" +
                "<infQ>\n" +
                "<cUnid>03</cUnid>\n" +
                "<tpMed>VOLUME</tpMed>\n" +
                "<qCarga>2.0000</qCarga>\n" +
                "</infQ>\n" +
                "<infQ>\n" +
                "<cUnid>03</cUnid>\n" +
                "<tpMed>PESO BRUTO</tpMed>\n" +
                "<qCarga>0.5080</qCarga>\n" +
                "</infQ>\n" +
                "</infCarga>\n" +
                "<infDoc>\n" +
                "<infNFe>\n" +
                "<chave>41200807038710000150550010000157421080157422</chave>\n" +
                "<dPrev>2020-11-25</dPrev>\n" +
                "</infNFe>\n" +
                "</infDoc>\n" +
                "<infModal versaoModal=\"3.00\">\n" +
                "<rodo>\n" +
                "<RNTRC>50119700</RNTRC>\n" +
                "</rodo>\n" +
                "</infModal>\n" +
                "<cobr>\n" +
                "<dup>\n" +
                "<nDup>19085-1/1</nDup>\n" +
                "<dVenc>2016-04-08</dVenc>\n" +
                "<vDup>95.87</vDup>\n" +
                "</dup>\n" +
                "<dup>\n" +
                "<nDup>2212-1/1</nDup>\n" +
                "<dVenc>2020-12-05</dVenc>\n" +
                "<vDup>75.00</vDup>\n" +
                "</dup>\n" +
                "</cobr>\n" +
                "</infCTeNorm>\n" +
                "<infRespTec>\n" +
                "<CNPJ>04329365000115</CNPJ>\n" +
                "<xContato>Leandro Penha</xContato>\n" +
                "<email>leandropenha@wvetro.com.br</email>\n" +
                "<fone>4331724200</fone>\n" +
                "<idCSRT>099</idCSRT>\n" +
                "<hashCSRT>YWFhYWFhYWFhYWFhYWFhYWFhYWE=</hashCSRT>\n" +
                "</infRespTec>\n" +
                "</infCte>\n" +
                "<infCTeSupl>\n" +
                "<qrCodCTe><![CDATA[http://www.fazenda.pr.gov.br/cte/qrcode?chCTe=41200807038710000150550010000157421080157422&tpAmb=2]]></qrCodCTe>\n" +
                "</infCTeSupl>\n" +
                "</CTe>";

        /*
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +                "<enviCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"3.00\">\n" +                "<idLote>2212</idLote>\n" +                "<CTe xmlns=\"http://www.portalfiscal.inf.br/cte\">\n" +                "<infCte Id=\"CTe\" versao=\"3.00\">\n" +                "<ide>\n" +                "<cUF>41</cUF>\n" +                "<cCT>11002212</cCT>\n" +                "<CFOP>5.352</CFOP>\n" +                "<natOp>PRESTACAO SERV TRANSPORTES A ESTAB INDUSTRIAL</natOp>\n" +                "<mod>57</mod>\n" +                "<serie>1</serie>\n" +                "<nCT>2212</nCT>\n" +                "<dhEmi>2020-11-25T13:38:41-03:00</dhEmi>\n" +                "<tpImp>1</tpImp>\n" +                "<tpEmis>1</tpEmis>\n" +                "<tpAmb>2</tpAmb>\n" +                "<tpCTe>0</tpCTe>\n" +                "<procEmi>0</procEmi>\n" +                "<verProc>1</verProc>\n" +                "<indGlobalizado>0</indGlobalizado>\n" +                "<cMunEnv>4101507</cMunEnv>\n" +                "<xMunEnv>ARAPONGAS</xMunEnv>\n" +                "<UFEnv>PR</UFEnv>\n" +                "<modal>01</modal>\n" +                "<tpServ>0</tpServ>\n" +                "<cMunIni>4101507</cMunIni>\n" +                "<xMunIni>ARAPONGAS</xMunIni>\n" +                "<UFIni>PR</UFIni>\n" +                "<cMunFim>4115200</cMunFim>\n" +                "<xMunFim>MARINGA</xMunFim>\n" +                "<UFFim>PR</UFFim>\n" +                "<retira>0</retira>\n" +                "<indIEToma>1</indIEToma>\n" +                "<toma3>\n" +                "<toma>0</toma>\n" +                "</toma3>\n" +                "</ide>\n" +                "<compl>\n" +                "<fluxo>\n" +                "<xOrig>100</xOrig>\n" +                "</fluxo>\n" +                "<Entrega>\n" +                "<semData>\n" +                "<tpPer>0</tpPer>\n" +                "</semData>\n" +                "<semHora>\n" +                "<tpHor>0</tpHor>\n" +                "</semHora>\n" +                "</Entrega>\n" +                "<origCalc>MANDAGUARI</origCalc>\n" +                "<destCalc>MARINGA</destCalc>\n" +                "<xObs> 000015742 </xObs>\n" +                "</compl>\n" +                "<emit>\n" +                "<CNPJ>18374429000104</CNPJ>\n" +                "<IE>9072252591</IE>\n" +                "<xNome>J.M. TRANSPORTES LTDA ME</xNome>\n" +                "<xFant>JM TRANSPORTES</xFant>\n" +                "<enderEmit>\n" +                "<xLgr>RUA SANA CASTANHA</xLgr>\n" +                "<nro>241</nro>\n" +                "<xBairro>JD SANTA ALICE</xBairro>\n" +                "<cMun>4101507</cMun>\n" +                "<xMun>ARAPONGAS</xMun>\n" +                "<CEP>86701836</CEP>\n" +                "<UF>PR</UF>\n" +                "<fone>4332753810</fone>\n" +                "</enderEmit>\n" +                "</emit>\n" +                "<rem>\n" +                "<CNPJ>07038710000150</CNPJ>\n" +                "<IE>9032296324</IE>\n" +                "<xNome>F LOPES CAFEEIRA LTDA - EPP</xNome>\n" +                "<xFant>CAFEEIRA BOA ESPERANCA</xFant>\n" +                "<fone>32331561</fone>\n" +                "<enderReme>\n" +                "<xLgr>ROD PR 444</xLgr>\n" +                "<nro>SN</nro>\n" +                "<xBairro>GL PATR MANDAGUARI</xBairro>\n" +                "<cMun>4114203</cMun>\n" +                "<xMun>MANDAGUARI</xMun>\n" +                "<CEP>86975000</CEP>\n" +                "<UF>PR</UF>\n" +                "<cPais>1058</cPais>\n" +                "<xPais>BRASIL</xPais>\n" +                "</enderReme>\n" +                "</rem>\n" +                "<dest>\n" +                "<CNPJ>29971780000107</CNPJ>\n" +                "<IE>9078052128</IE>\n" +                "<xNome>NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALO</xNome>\n" +                "<enderDest>\n" +                "<xLgr>PRACA DAS AMERICAS</xLgr>\n" +                "<nro>202</nro>\n" +                "<xBairro>CENTRO</xBairro>\n" +                "<cMun>4115200</cMun>\n" +                "<xMun>MARINGA</xMun>\n" +                "<CEP>87050550</CEP>\n" +                "<UF>PR</UF>\n" +                "<cPais>1058</cPais>\n" +                "<xPais>BRASIL</xPais>\n" +                "</enderDest>\n" +                "</dest>\n" +                "<vPrest>\n" +                "<vTPrest>75.00</vTPrest>\n" +                "<vRec>75.00</vRec>\n" +                "<Comp>\n" +                "<xNome>FRETE</xNome>\n" +                "<vComp>75.00</vComp>\n" +                "</Comp>\n" +                "</vPrest>\n" +                "<imp>\n" +                "<ICMS/>\n" +                "<vTotTrib>0.00</vTotTrib>\n" +                "</imp>\n" +                "<infCTeNorm>\n" +                "<infCarga>\n" +                "<vCarga>6.50</vCarga>\n" +                "<proPred>VOLUMES</proPred>\n" +                "<infQ>\n" +                "<cUnid>03</cUnid>\n" +                "<tpMed>VOLUME</tpMed>\n" +                "<qCarga>2.0000</qCarga>\n" +                "</infQ>\n" +                "<infQ>\n" +                "<cUnid>03</cUnid>\n" +                "<tpMed>PESO BRUTO</tpMed>\n" +                "<qCarga>0.5080</qCarga>\n" +                "</infQ>\n" +                "</infCarga>\n" +                "<infDoc>\n" +                "<infNFe>\n" +                "<chave>41200807038710000150550010000157421080157422</chave>\n" +                "<dPrev>2020-11-25</dPrev>\n" +                "</infNFe>\n" +                "</infDoc>\n" +                "<infModal versaoModal=\"3.00\">\n" +                "<rodo>\n" +                "<RNTRC>50119700</RNTRC>\n" +                "</rodo>\n" +                "</infModal>\n" +                "<cobr>\n" +                "<dup>\n" +                "<nDup>702-1/1</nDup>\n" +                "<dVenc>2016-04-08</dVenc>\n" +                "<vDup>99.07</vDup>\n" +                "</dup>\n" +                "<dup>\n" +                "<nDup>2212-1/1</nDup>\n" +                "<dVenc>2020-12-05</dVenc>\n" +                "<vDup>75.00</vDup>\n" +                "</dup>\n" +                "</cobr>\n" +                "</infCTeNorm>\n" +                "<infRespTec>\n" +                "<CNPJ>04329365000115</CNPJ>\n" +                "<xContato>Leandro Penha</xContato>\n" +                "<email>leandropenha@wvetro.com.br</email>\n" +                "<fone>4331724200</fone>\n" +                "<idCSRT>99</idCSRT>\n" +                "<hashCSRT>YWFhYWFhYWFhYWFhYWFhYWFhYWE=</hashCSRT>\n" +                "</infRespTec>\n" +                "</infCte>\n" +                "</CTe>\n" +                "</enviCTe>";
        */

        String response;

        try {
            //ok
            response = api.transmitir("1", "3.00", xml);
            //ok
            //response = api.geraChaveCTe(xml);
            //ok
            //response = api.geraQrCode(xml);
            //ok
            //response = api.consultaStatusServicoCod("PR");
            //error
            //response = api.cancelarCteAssinada("41201124476580000156570010000275021000375663", "154198419105185984");

            //response = api.cancelar("41201124476580000156570010000275021000375663", "154198419105185984", "Cancelamento teste");
            //não sei
            //response = api.geraLinkQrCode("41200807038710000150550010000157421080157422","2");
            //response = api.consultaProcessamento("411000074572860");
            //response = api.geraLinkQrCode("41201124476580000156570010000275021000375663","1","SP");


        } catch (Exception e) {
            response = "Error: " + e.getMessage();
        }
        System.out.println(response);
    }
}

