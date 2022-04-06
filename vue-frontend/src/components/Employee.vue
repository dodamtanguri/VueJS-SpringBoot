<template>
  <div class="container">
    <h1 class="text-center">Employees List</h1>
    <table class="tabel table-striped">
      <thead>
      <th>Employee Id</th>
      <th>Employee First Name</th>
      <th>Employee Last Name</th>
      <th>Employee Email</th>
      </thead>
      <tbody>
      <tr v-for="employee in employees" v-bind:key="employee.id">
        <tb> {{ employee.id }}</tb>
        <tb> {{ employee.firstName }}</tb>
        <tb> {{ employee.lastName }}</tb>
        <tb> {{ employee.email }}</tb>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import EmployeeService from "@/services/EmployeeService";



export default {
    name: 'Employees',
    data() {
      return {
        employees : []
      }

    },
    methods: {
      getEmployees() {
        EmployeeService.getEmployees().then((response) => {
          this.employees = response.data;
        } );
      }
    },
    created: {
      this.getEmployees()
    }
  }
</script>

