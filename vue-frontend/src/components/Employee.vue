/* eslint-disable */
// eslint-disable-next-line
<template>
  <div class="container">
    <h1 class="text-center">Employees List</h1>
    <table class="table table-striped">

      <thead>
      <th>Employee Id</th>
      <th>Employee First Name</th>
      <th>Employee Last Name</th>
      <th>Employee Email</th>
      </thead>
      <tbody>
      <tr v-for="employee in employees" v-bind:key="employee.id">
        <td> {{ employee.id }}</td>
        <td> {{ employee.firstName }}</td>
        <td> {{ employee.lastName }}</td>
        <td> {{ employee.email }}</td>
      </tr>
      </tbody>
    </table>
    <div>
      <b-container fluid>
        <b-row class="my-1">
          <b-col sm="2">
            <label for="input-email">Email:</label>
          </b-col>
          <b-col sm="10">
            <b-form-input id="input-email" size="sm" placeholder="Enter your email"></b-form-input>
          </b-col>
        </b-row>
        <b-row class="my-1">
          <b-col sm="2">
            <label for="input-first-name">First Name:</label>
          </b-col>
          <b-col sm="10">
            <b-form-input id="input-first-name" size="sm" placeholder="Enter your First Name"></b-form-input>
          </b-col>
        </b-row>
        <b-row class="my-1">
          <b-col sm="2">
            <label for="input-last-name">Last Name:</label>
          </b-col>
          <b-col sm="10">
            <b-form-input id="input-last-name" size="sm" placeholder="Enter your Last Name"></b-form-input>
          </b-col>
        </b-row>
      </b-container>


    </div>

  </div>


</template>

<script>
import EmployeeService from "@/services/EmployeeService";



export default {
  // eslint-disable-next-line
  name: 'Employees',
  data() {
    return {
      employees: []
    }
  },
  methods: {
    getEmployees() {
      EmployeeService.getEmployees().then((response) => {
        this.employees = response.data;
      });
    }
  },
  created() {
    this.getEmployees()
  }
}
</script>

