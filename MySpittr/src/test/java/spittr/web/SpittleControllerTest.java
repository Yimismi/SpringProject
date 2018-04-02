package spittr.web;

import java.util.*;
import org.junit.*;
import org.springframework.test.web.servlet.*;
import org.springframework.web.servlet.view.*;
import spittr.*;
import spittr.data.*;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class SpittleControllerTest {

    @Test
    public void shouldShowRecentSpittles() throws Exception {
        List<Spittle> expectedSpittles = createSpittleList(20);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(123456, 20)).thenReturn(expectedSpittles);
        SpittleController controller = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).setSingleView(
                new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
        mockMvc.perform(get("/spittles?max=123456&count=20"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(
                        model().attribute("spittleList",
                        hasItems(expectedSpittles.toArray()))
                );
    }

    @Test
    public void shouldShowSpittle() throws Exception {
        Spittle expectedSpittle = new Spittle("hello world", new Date());
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findOne(1)).thenReturn(expectedSpittle);
        SpittleController controller = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).setSingleView(
                new InternalResourceView("/WEB-INF/views/spittle.jsp")).build();
        mockMvc.perform(get("/spittles/1"))
                .andExpect(view().name("spittle"))
                .andExpect(model().attributeExists("spittle"))
                .andExpect(model().attribute("spittle", expectedSpittle));
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("spittle " + i, new Date()));
        }
        return spittles;
    }
}
