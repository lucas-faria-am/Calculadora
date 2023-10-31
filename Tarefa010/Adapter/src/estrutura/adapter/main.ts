import { validaEmailC } from "./clientecomDesignPartner";
import { validaEmailS } from "./clienteSemDesignPartner";
import { emailValidacaoAdapter } from "./validacao/emailValidacaoAdapter";

const email = "lucas.carvalho@gmail.com";

validaEmailC(new emailValidacaoAdapter(), email); //com o padrão aplicado
validaEmailS(email); //sem o padrão aplicado
