import com.example.mili_300324049.ConnectionClass;
import com.example.mili_300324049.LoanCrud;
import com.example.mili_300324049.LoanModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class LoanCrudTest {
    @InjectMocks
    private LoanCrud ss;

    @Mock
    private Connection connection;

    @Mock
    private ResultSet resultSet;

    @Mock
    private PreparedStatement preparedStatement;

    @Mock
    private ConnectionClass con;

    LoanModel sd = new LoanModel("1", "Milli", (int) 3000.0,(int) 2,"personal");

    @BeforeEach
    public void Setup() throws SQLException, ClassNotFoundException {
        MockitoAnnotations.openMocks(this);
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(con.connect()).thenReturn(connection);
        sd = new LoanModel("1", "Milli", (int) 3000.0,(int) 2,"personal");
    }

    @Test
    void add() throws SQLException, ClassNotFoundException {
        when(connection.prepareStatement("INSERT INTO loantable VALUES ( ?, ?, ? ,?,?)")).thenReturn(preparedStatement);
        ss.update(sd);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    void delete() throws SQLException {
        when(connection.prepareStatement("Delete from loantable where clientno = ?")).thenReturn(preparedStatement);
        ss.delete("1");
        verify(preparedStatement).executeUpdate();
    }

    @Test
    void edit() throws SQLException, ClassNotFoundException {
        sd=new LoanModel("1", "Milli", (int) 3000.0,(int) 2,"personal");
        assertEquals("Milli", sd.getClient_name());
    }
}