import { http } from './config'

export default {

    realizarLogin:(login) => {
        return http.post('login', login);
    }

}