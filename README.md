The dependencies of some of the beans in the application context form a cycle:

┌──->──┐
|  repositoryApplication (field private org.springframework.web.client.RestTemplate com.example.repository.RepositoryApplication.restTemplate)
└──<-──┘


Action:

Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.
