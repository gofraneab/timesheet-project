package tn.esprit.spring.services;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {
    @Test
    public void testAddUser() {
        String failTest = System.getenv("TIMESHEET_TESTS_FAIL");
        if ("True".equalsIgnoreCase(failTest)) {
            fail("Test échoue car TIMESHEET_TESTS_FAIL est activé !");
        }
    }


}