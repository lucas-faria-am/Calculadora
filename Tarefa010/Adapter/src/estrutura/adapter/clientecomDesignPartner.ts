import { IemailValidacaorProtocol } from "./validacao/IemailValidacaoProtocol";

export function validaEmailC(
    emailValidacao: IemailValidacaorProtocol,
    email: string
): void {
    if (emailValidacao.isEmail(email)) {
        console.log("email é valido!");
    } else {
        console.log("email invalido!");
    }
}
