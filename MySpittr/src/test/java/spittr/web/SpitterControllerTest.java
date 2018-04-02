package spittr.web;

import org.junit.*;
import org.springframework.test.web.servlet.*;
import spittr.*;
import spittr.data.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class SpitterControllerTest {
    @Test
    public void shouldShowRegisterForm() throws Exception {
        SpitterContorller contorller = new SpitterContorller();
        MockMvc mockMvc = standaloneSetup(contorller).build();
        mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("Yimi", "123456", "CHEN", "Kui", "1143937551@qq.com", "17734657744");
        Spitter saved = new Spitter(24L, "Yimi", "123456", "CHEN", "Kui", "1143937551@qq.com", "17734657744");
        when(mockRepository.save(unsaved)).thenReturn(saved);

        SpitterContorller contorller = new SpitterContorller(mockRepository);
        MockMvc mockMvc = standaloneSetup(contorller).build();
        mockMvc.perform(post("/spitter/register")
                .param("firstName", "CHEN")
                .param("lastName", "Kui")
                .param("username", "Yimi")
                .param("email", "1143937551@qq.com")
                .param("tel", "17734657744")).andExpect(redirectedUrl("/spitter/Yimi"));
        verify(mockRepository, atLeastOnce()).save(unsaved);
    }
}
