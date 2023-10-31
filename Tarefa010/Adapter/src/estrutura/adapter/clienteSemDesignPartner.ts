import isEmail from "validator/lib/isEmail";

export function validaEmailS(email: string): void {
    if (isEmail(email)) {
        console.log("É valido!");
    } else {
        console.log("É invalido!");
    }
}
