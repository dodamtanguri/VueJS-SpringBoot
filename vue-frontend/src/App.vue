<template>
  <div id="app">
    <Header />
    <Employee />


  </div>
</template>

<script>
import Employee from "@/components/Employee";
import Header from "@/components/layOut/Header";



export default {
  name: 'App',
  components: {
    Header,
    Employee
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
