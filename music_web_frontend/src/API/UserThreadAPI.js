import axios from 'axios'

const USERTHREAD_REST_API_URL = 'http://localhost:8080/threads';

class UserThreadAPI{
    getUserThreads(){
        return axios.get(USERTHREAD_REST_API_URL);
    }
}

export default new UserThreadAPI(); 

