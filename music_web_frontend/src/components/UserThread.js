import React from 'react';
import UserThreadAPI from '../API/UserThreadAPI';

class UserThread extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            threads:[]
        }
    }

    componentDidMount(){
        UserThreadAPI.getUserThreads().then((response) =>{
            this.setState({threads : response.data})
        });
    }

    render (){
        return(
            <div>
                {
                    this.state.threads.map((thread) => (
                        <p1>{thread.title} <br></br>
                            {thread.content}
                        </p1>
                        )
                    )
                }
            </div>
        )
    }
}

export default UserThread;
