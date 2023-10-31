import { IemailValidacaorProtocol } from "./IemailValidacaoProtocol";
import isEmail from "validator/lib/isEmail";

export class emailValidacaoAdapter implements IemailValidacaorProtocol {
    isEmail(valor: string): boolean {
        return isEmail(valor);
    }

}