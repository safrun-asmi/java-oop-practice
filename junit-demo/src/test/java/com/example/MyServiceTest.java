package com.example;

import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyServiceTest {
    @Test
    public void testExternalApi() {
        // Arrange: create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub: define behavior
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act: use service with mock
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert: verify result
        assertEquals("Mock Data", result);
    }
}
