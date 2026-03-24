const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootmcpckeqv/",
            name: "springbootmcpckeqv",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "基于Spring Boot装修公司管理平台的设计与实现"
        } 
    }
}
export default base
