<template>
  <div v-for="(row, idx) in userInfo" :key="idx">
    {{row}} : <input v-model="inputData[idx]"/>    
  </div>
  <div>
    <button @click="validationCheck">회원가입</button>
  </div>

  <div>
    <button @click="search">찾기</button>        
    <button @click="validationCheck()">추가</button>        
  </div>  
  
</template>

<script>
import axios from '@/http.js';
export default {
  data() {
    return {      
      userInfo: ["이름", "아이디", "비밀번호", "이메일"],
      inputData: ["","","",""],
      check: 0,
    };
  },
  methods: {
    search() {
      axios
        .get('/rest/search')
        .then(({ data }) => {
          console.log(data);
        })
        .catch((e) => console.log(e));
    },
    join() {      
      const data = {
        name: this.inputData[0],
        user: this.inputData[1],
        pw: this.inputData[2],
        email: this.inputData[3],
      }
              
      axios
        .post('/rest/join', data)
        .then(({ data }) => {
          console.log(data);
          alert("회원가입 성공")
        })
        .catch((e)=> console.log(e));
    },
    validationCheck() {                  
      axios
        .get('/rest/check', { params: { user: this.inputData[1] } })
        .then(({ data }) => {  
          if(data >= 1) {
            alert("중복된 아이디가 있습니다");            
          } else {
            this.join();
          }
        })
        .catch((e) => console.log(e));                
    },
  },
}
</script>

<style scoped>

</style>
